package gamedemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String size;
    private String color;
    private int num;//大小

    @Override
    public String toString() {
        return color + size;
    }

}
