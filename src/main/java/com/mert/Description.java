package com.mert;

public class Description {
    /**
     * JDBc manual ve CRUD sınıflarında çalışmak fazla zaman alabilir.
     * Bunu bir framework olan Hibernate ile yaparsak daha kısa sürede
     * daha hızlı bir şekilde işlemler yapabiliriz.
     *
     * *->>>> build. gradle kısmına aşağıdakileri yazpıştırmamız laızm.
     *    // https://mvnrepository.com/artifact/org.hibernate.orm/hibernate-core
     *     implementation group: 'org.hibernate.orm', name: 'hibernate-core', version: '6.4.4.Final'
     *
     *     // https://mvnrepository.com/artifact/org.postgresql/postgresql
     *     implementation group: 'org.postgresql', name: 'postgresql', version: '42.7.3'
     *
     *     ---------
     *     Sonrasında -> resourses kısmına
     *     META-INF -> filder oluşturuyoruz.
     *     persistence.xml -> file oluşturup aşağıdaki metinleri giriyoruz.
     *      -->> burada class tanımlamasını
     *      --->> Database name, username, password doldurmamız gerekiyor.
     *
     *     *-----
     *     lombok için
     *
     // https://mvnrepository.com/artifact/org.projectlombok/lombok
     implementation group: 'org.projectlombok', name: 'lombok', version: '1.18.32'
     // https://mvnrepository.com/artifact/org.projectlombok/lombok
     annotationProcessor group: 'org.projectlombok', name: 'lombok', version: '1.18.32'
     *
     */


}
