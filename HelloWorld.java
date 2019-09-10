@Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
        System.out.println("1");
        System.out.println(person);
        System.out.println("2");
    }