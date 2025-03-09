@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void testUserCreation() {
        User user = new User(null, "testuser", "password", Role.USER);
        User savedUser = userRepository.save(user);
        assertNotNull(savedUser.getId());
    }
}