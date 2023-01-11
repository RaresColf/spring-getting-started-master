package ro.sda.lombok;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

  @Test
  void testSetFirstNameReflection() throws NoSuchFieldException, IllegalAccessException {

    final User user = new User();

    user.setFirstName("Messi");

    // use of reflection
    final Field field = user.getClass().getDeclaredField("firstName");
    field.setAccessible(true);
    assertEquals("Messi", field.get(user));
  }


  @Test
  public void testGetFirstNameReflection() throws NoSuchFieldException, IllegalAccessException {

    final User user = new User();
    // use of reflection
    final Field field = user.getClass().getDeclaredField("firstName");
    field.setAccessible(true);
    field.set(user, "Ronaldo");

    final String result = user.getFirstName();

    assertEquals("Ronaldo", result);
  }

  @Test
  public void testUserAllArgsConstructorReflection() throws NoSuchFieldException, IllegalAccessException {

    final User user = new User("Lionel", "Messi", 35);

    final Field firstName = user.getClass().getDeclaredField("firstName");
    firstName.setAccessible(true);
    assertEquals("Lionel", firstName.get(user));

    final Field lastName = user.getClass().getDeclaredField("lastName");
    lastName.setAccessible(true);
    assertEquals("Messi", lastName.get(user));

    final Field age = user.getClass().getDeclaredField("age");
    age.setAccessible(true);
    assertEquals(35, age.get(user));
  }
}