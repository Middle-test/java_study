package com.itheima.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JD implements Switch {
    private String name;
    private boolean status;

    @Override
    public void press() {
        //控制当前设备开和关
        status = !status;
    }
}
