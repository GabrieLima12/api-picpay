package com.desafio.picpay.domain.usuario;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record UsuarioDTO(
        @NotNull String primeiroNome,
        @NotNull String sobrenome,
        @NotNull String documento,
        @NotNull BigDecimal saldo,
        @NotNull String email,
        @NotNull String senha,
        @NotNull TipoUsuario tipoUsuario) {
}
