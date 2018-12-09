package pl.com.empas.java_introductory_course.generics.validators;


public interface Validator<T extends Number> {

    boolean validate(T value);

}

