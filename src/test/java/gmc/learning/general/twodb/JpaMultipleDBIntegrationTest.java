//package gmc.learning.general.twodb;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//import javax.transaction.Transactional;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import gmc.learning.general.twodb.daos.ProductRepository;
//import gmc.learning.general.twodb.daos.UserRepository;
//import gmc.learning.general.twodb.models.Product;
//import gmc.learning.general.twodb.models.User;
//
////@RunWith(SpringRunner.class)
//@SpringBootTest
//@EnableTransactionManagement
//public class JpaMultipleDBIntegrationTest {
// 
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Test
//    @Transactional
//    public void whenCreatingUser_thenCreated() {
//        User user = new User();
//        user.setName("John");
//        user.setEmail("john@test.com");
//        user.setAge(20);
//        user = userRepository.save(user);
//
//        assertNotNull(userRepository.findById(user.getId()));
//    }
//
////    @Test
////    @Transactional
////    public void whenCreatingUsersWithSameEmail_thenRollback() {
////        User user1 = new User();
////        user1.setName("John");
////        user1.setEmail("john@test.com");
////        user1.setAge(20);
////        user1 = userRepository.save(user1);
////        assertNotNull(userRepository.findById(user1.getId()));
////
////        User user2 = new User();
////        user2.setName("Tom");
////        user2.setEmail("john@test.com");
////        user2.setAge(10);
////        try {
////            user2 = userRepository.save(user2);
////        } catch (DataIntegrityViolationException e) {
////        }
////
////        assertNull(userRepository.findById(user2.getId()));
////    }
//
//    @Test
//    @Transactional
//    public void whenCreatingProduct_thenCreated() {
//        Product product = new Product();
//        product.setName("Book");
//        product.setId(2);
//        product.setPrice(20);
//        product = productRepository.save(product);
//
//        assertNotNull(productRepository.findById(product.getId()));
//    }
//}