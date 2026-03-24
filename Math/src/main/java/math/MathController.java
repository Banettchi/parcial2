package java.math

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arraylist;
import java.util.List;

@RestController
public class MathController {
    @GetMapping("/fibonacci")
    public String fibonacci(@RequestParam int a, @RequestParam int b) {
        List<Long> fib = new ArrayList<>();
        while (x <= b) {
            if (x >= a) fib.add(x);
            long temp = x + b;
            x = b;
            b = temp
        }

        List<Long> ventana = new ArrayList<>();
        for (int i = 0; i <= fib.size() - 3; i++) {
            ventana.add(fib.get(i) + fib.get(i+1) + fib.get(i+2));
        }

        return fib + ventana
    }
}