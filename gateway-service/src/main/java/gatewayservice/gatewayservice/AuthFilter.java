package gatewayservice.gatewayservice;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AuthFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1. 从查询参数或请求头获取 Token（优先）
        String token = exchange.getRequest().getQueryParams().getFirst("token");
        if (token == null) {
            token = exchange.getRequest().getHeaders().getFirst("Authorization");
        }

        // 2. 判空并拒绝无 Token 请求
        if (token == null || token.isEmpty()) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }

        // 3. 实际项目应调用认证服务校验 Token
        if (!isValidToken(token)) {
            exchange.getResponse().setStatusCode(HttpStatus.FORBIDDEN);
            return exchange.getResponse().setComplete();
        }

        // 4. 校验通过，继续转发请求
        return chain.filter(exchange);
    }

    // 示例：模拟 Token 校验逻辑（实际项目替换为 JWT 解析或远程调用）
    private boolean isValidToken(String token) {
        return "valid-token".equals(token); // 替换为你的校验逻辑
    }
}
