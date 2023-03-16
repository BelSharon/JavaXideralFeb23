package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.junit.Test;

//ESTAMO USANDO JUnit 4
//https://www.baeldung.com/java-optional
public class OptionalTest {

	@Test
	public void whenCreatesEmptyOptional_thenCorrect() {
		
		//queremos validar que el optional está vacío
		Optional<String> empty =Optional.empty();
		//empty.isPresent() regresa false
		assertFalse(empty.isPresent());
	}

	@Test
	public void givenNonNull_whewnCreatesNonNullable_thenCorrect() {
		
		String nombre = "Juanito banana";
		//queremos validar que el optional no está vacío
		Optional<String> opt = Optional.of(nombre);
		//opt.isPresent() regresa true
		assertTrue(opt.isPresent());
	}
	
	@Test(expected = NullPointerException.class)
	public void givenNull_whenThrowsErrorOnCreate_thenCorrect() {
	    String name = null;
	    Optional.of(name);
	}
	
	@Test
	public void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    assertTrue(opt.isPresent());
	}
	
	@Test
	public void givenOptional_whenIsPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertTrue(opt.isPresent());

	    opt = Optional.ofNullable(null);
	    assertFalse(opt.isPresent());
	}
	
	/* PARA JAVA 11
	@Test
	public void givenAnEmptyOptional_thenIsEmptyBehavesAsExpected() {
	    Optional<String> opt = Optional.of("Baeldung");
	    assertFalse(opt.isEmpty());
	    opt = Optional.ofNullable(null);
	    assertTrue(opt.isEmpty());
	}*/
	
	@Test
	public void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.of("");
	    //opt.ifPresent(name -> System.out.println(name.length()));
	}
	
	@Test
	public void whenOrElseWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    assertEquals("john", name);
	}
	
	@Test
	public void whenOrElseWorks_thenCorrect2() {
	    String nullName = "Filologo";
	    String name = Optional.ofNullable(nullName).orElse("john");
	    assertEquals("Filologo", name);
	}
	
	@Test
	public void whenOrElseGetWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseGet(() -> "john");
	    assertEquals("john", name);
	}
	
	@Test
	public void whenOrElseGetAndOrElseOverlap_thenCorrect() {
	    String text = null;

	    //String defaultText = Optional.ofNullable(text).orElseGet(this::getMyDefault);
	    String defaultText = Optional.ofNullable(text).orElseGet(()->getMyDefault());
	    assertEquals("Default Value", defaultText);

	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    assertEquals("Default Value", defaultText);
	}
	
	public String getMyDefault() {
	    //System.out.println("Operación muy costosa$$$$");
	    return "Default Value";
	}
	
	@Test
	public void whenOrElseGetAndOrElseDiffer_thenCorrect() {
	    String text = "Text present";

	    //System.out.println("Using orElseGet:");
	    
	    String defaultText 
	      = Optional.ofNullable(text).orElseGet(()->getMyDefault());
	    assertEquals("Text present", defaultText);

	    //System.out.println("Using orElse:");
	    
	    defaultText = Optional.ofNullable(text).orElse(getMyDefault());
	    assertEquals("Text present", defaultText);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenOrElseThrowWorks_thenCorrect() {
	    String nullName = null;
	    String name = Optional.ofNullable(nullName).orElseThrow(
	    		IllegalArgumentException::new);
	}
	
	/* MARCA ERROR
	 * @Test(expected = NoSuchElementException.class) public void
	 * whenNoArgOrElseThrowWorks_thenCorrect() { String nullName = null; String name
	 * = Optional.ofNullable(nullName).orElseThrow(); }
	 */
	
	@Test
	public void givenOptional_whenGetsValue_thenCorrect() {
	    Optional<String> opt = Optional.of("baeldung");
	    String name = opt.get();
	    assertEquals("baeldung", name);
	}
	
	@Test(expected = NoSuchElementException.class)
	public void givenOptionalWithNull_whenGetThrowsException_thenCorrect() {
	    Optional<String> opt = Optional.ofNullable(null);
	    String name = opt.get();
	}
	
	@Test
	public void whenOptionalFilterWorks_thenCorrect() {
	    Integer year = 2016;
	    Optional<Integer> yearOptional = Optional.of(year);
	    boolean is2016 = yearOptional.filter(y -> y == 2016).isPresent();
	    assertTrue(is2016);
	    boolean is2017 = yearOptional.filter(y -> y == 2017).isPresent();
	    assertFalse(is2017);
	}
	
	public boolean priceIsInRange1(Modem modem) {
	    boolean isInRange = false;

	    if (modem != null 
	    		&& modem.getPrice() != null 
	            && (modem.getPrice() >= 10 
	            && modem.getPrice() <= 15)) {

	        isInRange = true;
	        
	    }
	    return isInRange;
	}
	
	public boolean priceIsInRange2(Modem modem2) {
	     return Optional.ofNullable(modem2)
	       .map(Modem::getPrice)
	       .filter(p -> p >= 10)
	       .filter(p -> p <= 15)
	       .isPresent();
	 }
	
	@Test
	public void whenFiltersWithoutOptional_thenCorrect() {
	    assertTrue(priceIsInRange1(new Modem(10.0)));
	    assertFalse(priceIsInRange1(new Modem(9.9)));
	    assertFalse(priceIsInRange1(new Modem(null)));
	    assertFalse(priceIsInRange1(new Modem(15.5)));
	    assertFalse(priceIsInRange1(null));
	}
	
	@Test
	public void whenFiltersWithOptional_thenCorrect() {
	    assertTrue(priceIsInRange2(new Modem(10.0)));
	    assertFalse(priceIsInRange2(new Modem(9.9)));
	    assertFalse(priceIsInRange2(new Modem(null)));
	    assertFalse(priceIsInRange2(new Modem(15.5)));
	    assertFalse(priceIsInRange2(null));
	}
	
	@Test
	public void givenOptional_whenMapWorks_thenCorrect() {
	    List<String> companyNames = Arrays.asList(
	      "paypal", "oracle", "", "microsoft", "", "apple");
	    
	    Optional<List<String>> listOptional = 
	    		Optional.of(companyNames);

	    int size = listOptional
	    			.map(List::size)
	    			.orElse(0);
	    
	    assertEquals(6, size);
	}
	
	@Test
	public void givenOptional_whenMapWorks_thenCorrect2() {
	    String name = "baeldung";
	    Optional<String> nameOptional = Optional.of(name);

	    int len = nameOptional
	    			.map(String::length)
	    			.orElse(0);
	    
	    assertEquals(8, len);
	}
	
	@Test
	public void givenOptional_whenMapWorksWithFilter_thenCorrect() {
	    String password = " password ";
	    Optional<String> passOpt = Optional.of(password);
	    
	    boolean correctPassword = 
	    		passOpt.filter(
	    			pass -> pass.equals("password")).isPresent();
	    assertFalse(correctPassword);

	    correctPassword = passOpt
	      .map(String::trim)
	      .filter(pass -> pass.equals("password"))
	      .isPresent();
	    assertTrue(correctPassword);
	}
	
	@Test
	public void givenOptional_whenFlatMapWorks_thenCorrect2() {
	    Person person = new Person("john", 26);
	    Optional<Person> personOptional = Optional.of(person);

	    //***** ALTERNATIVA 1 ******//
	    Optional<Optional<String>> nameOptionalWrapper  
	      = personOptional.map(Person::getName);
	    
	    Optional<String> nameOptional  
	      = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
	    
	    String name1 = nameOptional.orElse("");
	    assertEquals("john", name1);

	    //***** ALTERNATIVA 2 ******//
	    String name = personOptional
	      .flatMap(Person::getName)
	      .orElse("");
	    assertEquals("john", name);
	}
	

}

//CLASE MODEM
class Modem {
    private Double price;

    public Modem(Double price) {
        this.price = price;
    }

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}


//CLASE PERSON
class Person {
    private String name;
    private int age;
    private String password;

    public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
