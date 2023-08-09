import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

public class CheckPersonTest{

    @Test
    public void getAgeTest() {
        Person p = new Person();

        int expected = 13;
        int actual = p.getAge();
        p.setBirthday(2013, Month.APRIL, 24);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSexTest() {
        Person p = new Person();
        Person.Sex expected = Person.Sex.FEMALE;
        p.setGender(expected);

        Person.Sex actual = p.getGender();

        Assert.assertEquals(expected, actual);
    }
}
