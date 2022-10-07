package com.gamekeys.gameshop.dto;

import com.gamekeys.gameshop.entity.AppUser;
import com.gamekeys.gameshop.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Data // This replaces the @Getter @Setter @NoArgsConstructor
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class ActivationKeyDto {

    private Long id;

    private UUID productKey;

    private AppUser user;

    private Product product;

}