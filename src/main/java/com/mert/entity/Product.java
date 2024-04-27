package com.mert.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * İlgili kod bloğunu seçtikten sonra IDE kısmındaki "Code" kısmına tıklayıp ->"Save as live templete "
 * seçip ilgili code ve code bloğuna kısayol atayabiliriz. Ben burada lombok , id_lombok ve lombok_jakarta ekledim
 *
 */

@Data //
@AllArgsConstructor //
@NoArgsConstructor // parametreli constructor ların tümü
@Builder //default constructor
@Entity //oluşturduğumuz clasın entity olduğunu belirtiyoruz
@Table(name = "tbl_product") //table ismi bu sekilde
public class Product {
    // id önemli bu bize SQL kısmında primary key oluyor.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id için otomatik artan HB sequence oluşturur
            Long id;
    String name;

    /**
     * normal şartlarda getter & setter , construct gibi metodlar oluşturuyorduk. Ancak lombok ile
     * bu ekstra kodları engellemiş olduk. Bu yuzden bu kodları eklemiyoruz.
     * Şimdi "Runner" class'ta Product adında bir nesne oluşturacağız.
     */

}
