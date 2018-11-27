package innerclasses;

/**
 * Create by leonardo on 2018/11/14
 */
public class MultiImplementation {


}

class D {}

abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}

