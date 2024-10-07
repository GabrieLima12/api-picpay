package com.desafio.picpay.domain.transacao;

import com.desafio.picpay.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transacoes")
@Table(name = "transacoes")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "remetente_id")
    private Usuario remetente;

    @ManyToOne
    @JoinColumn(name = "recebedor_id")
    private Usuario recebedor;

    private LocalDateTime timestamp;
}
