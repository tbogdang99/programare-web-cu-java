package ro.example.lab2.exercise3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderLoggingAspect {

    @Pointcut("execution(* ro.example.lab2.exercise3.service.OrderService.placeOrder(..))")
    public void orderMethods() {
    }

    @Before("orderMethods()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[AOP] Before: "
                + joinPoint.getSignature().getName());
    }

    // TODO 1: Implementati @AfterReturning
    // Afisati un mesaj cand comanda este procesata cu succes.
    // Indiciu: folositi atributul returning pentru a obtine rezultatul.

    // TODO 2: Implementati @AfterThrowing
    // Afisati mesajul exceptiei atunci cand plasarea comenzii esueaza.

    // TODO 3: Implementati @After
    // Afisati un mesaj la finalul metodei,
    // indiferent daca metoda reuseste sau arunca o exceptie.

    // TODO 4 (BONUS): Implementati @Around
    // Masurati durata executiei folosind System.nanoTime().
    // Nu uitati sa apelati proceed()!
}
