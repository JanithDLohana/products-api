package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    @RequestMapping("/products")
    public class ProductController{
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return new Product(id, "laptop", 999.99);

        @Autowired private ProductServices productServices;
        @GetMapping("/products")

        public List<Product> getAllproducts(){
            return productServices.getAllProducts();
        }

        @GetMapping("/products/{id}")
        public Product getProductById(@PathVariable Long id){
            return productServices.getProductById(id).orElse(null);
        }

        @PostMapping ("/product")
        public Product addProduct(@RequestBody Product Product){
            return productServices.addProduct(Product);
        }

        @DeleteMapping("/products/{id}")
        public void deleteProduct(@PathVariable Long id){
            productServices.deleteProduct(id);
        }
        @GetMapping("/products/search")
        public List<Product>search(@RequestParam String name){
            return productServices.findByName(name);
        }
    }

