package proxyImpl;

import proxy.IVehical;

public class Car implements IVehical {

    @Override
    public void run() {
        System.out.println("Car会跑");
    }
}
