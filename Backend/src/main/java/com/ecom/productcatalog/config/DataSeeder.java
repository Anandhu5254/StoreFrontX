package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics,home,clothing));

        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest model smartphone with amazing features.");
        phone.setImageUrl("https://img.freepik.com/premium-photo/smartphone-balancing-with-pink-background_23-2150271746.jpg?semt=ais_hybrid&w=740");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High performance laptop for daily use and gaming.");
        laptop.setImageUrl("https://media.istockphoto.com/id/1218414663/photo/laptop-outside-concept-empty-copy-space-blank-screen-mockup-soft-focus-laptop-in-nature.jpg?s=612x612&w=0&k=20&c=6cMfFXm1iWhWeiXwkDVIZM1fZ5WE7bl_ZwXo_9AKjHg=");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product tablet = new Product();
        tablet.setName("Tablet");
        tablet.setDescription("Lightweight tablet with high-resolution display.");
        tablet.setImageUrl("https://media.istockphoto.com/id/477596053/photo/samsung-galaxy-tab-3.jpg?s=612x612&w=0&k=20&c=3pQRcqxNy9Tn7M1QIi9Or5wkkdyBdcaobAofsp_xK28=");
        tablet.setPrice(349.99);
        tablet.setCategory(electronics);

        Product headphones = new Product();
        headphones.setName("Wireless Headphones");
        headphones.setDescription("Noise-canceling wireless headphones for immersive sound.");
        headphones.setImageUrl("https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/peripherals/headphones/wl5024/spi/ng/headset-wl5024-bk-campaign-hero-504x350-ng.psd?fmt=jpg&wid=504&hei=350");
        headphones.setPrice(199.99);
        headphones.setCategory(electronics);

        Product jacket = new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm and cozy jacket for winter.");
        jacket.setImageUrl("https://www.hindustantimes.com/ht-img/img/2024/12/27/550x309/myntra_year_end_bash_layering_1735288526777_1735288538371.jpg");
        jacket.setPrice(129.99);
        jacket.setCategory(clothing);

        Product jeans = new Product();
        jeans.setName("Denim Jeans");
        jeans.setDescription("Classic blue denim jeans with a comfortable fit.");
        jeans.setImageUrl("https://images.bestsellerclothing.in/data/only/17-jan-2025/214886601_g0.jpg?width=380&height=500&mode=fill&fill=blur&format=auto");
        jeans.setPrice(59.99);
        jeans.setCategory(clothing);

        Product sweater = new Product();
        sweater.setName("Knitted Sweater");
        sweater.setDescription("Soft and warm knitted sweater for chilly days.");
        sweater.setImageUrl("https://i.ytimg.com/vi/-R_5VEhDBLw/hq720.jpg?sqp=-oaymwEhCK4FEIIDSFryq4qpAxMIARUAAAAAGAElAADIQj0AgKJD&rs=AOn4CLAYZYwq06WotN32logw4EGvSkduvA");
        sweater.setPrice(49.99);
        sweater.setCategory(clothing);

        Product blender = new Product();
        blender.setName("Blender");
        blender.setDescription("High speed blender for smoothies and more.");
        blender.setImageUrl("https://media.istockphoto.com/id/1413732211/photo/blender-in-yellow-kitchen.jpg?s=612x612&w=0&k=20&c=DD5su-5EhYrxqOFrjjQGrLawpZ6l45xrxNyb8it56DI=");
        blender.setPrice(89.99);
        blender.setCategory(home);

        Product vacuum = new Product();
        vacuum.setName("Vacuum Cleaner");
        vacuum.setDescription("Powerful vacuum cleaner for deep carpet cleaning.");
        vacuum.setImageUrl("https://neatclean.com.au/wp-content/uploads/2024/03/Carpet-rug-cleaner-melbourne.jpg");
        vacuum.setPrice(159.99);
        vacuum.setCategory(home);

        Product toaster = new Product();
        toaster.setName("Toaster");
        toaster.setDescription("Compact toaster with multiple browning settings.");
        toaster.setImageUrl("https://wahs.com.au/wp-content/uploads/2019/04/WHT2STS03K_1-600x400.jpg");
        toaster.setPrice(29.99);
        toaster.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,tablet,headphones,jacket,jeans,sweater,blender,vacuum,toaster));
    }
}
