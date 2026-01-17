package DayNine;

public class Dog {
        private String name;
        private int age;

        public Dog(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public void setName(String dogName){
            name = dogName;
        }

        public void setAge(int dogAge){
            age = dogAge;
        }

        public int godPersonYears(){
            int result = age * 7;

            return result;
        }

}
