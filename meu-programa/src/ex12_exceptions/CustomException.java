package ex12_exceptions;

// Criando uma exceção customizada checada
class StateValidateException extends Exception {
    public StateValidateException(String msg) {
        super(msg);
    }
}

public class CustomException {
    // O método declara que pode lançar duas exceções diferentes
    static void checkState(String statusName) throws StateValidateException, Exception {
        if(statusName.equals("FL")) {
            throw new Exception("This state doesn't belong to Brazil");
        }
        if(!statusName.equalsIgnoreCase("PI") && !statusName.equalsIgnoreCase("POU")) {
            throw new StateValidateException("This state doesn't localized");
        }
        System.out.println("Welcome to " + statusName + " state!");
    }

    public static void main(String[] args) {
        try {
            checkState("pi");
        } catch (StateValidateException e){
            System.err.println("Error validation: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error generic: " + e.getMessage() + " select a brazilian state");
            }
        }
    }
