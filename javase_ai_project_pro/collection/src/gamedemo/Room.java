package gamedemo;

import java.util.*;

public class Room {
    //1、准备好54张牌，定义一个集合容器
    private List<Card> cards = new ArrayList<>();

    //2、初始化54张牌
    {
        //3、准备点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //4、准备花色
        String[] colors = {"♥", "♦", "♣", "♠"};
        //5、组合点数和花色
        int num = 0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                cards.add(new Card(size, color, num));
            }
        }
        Collections.addAll(cards, new Card("", "🃏", ++num), new Card("", "👲", num));
        System.out.println("新牌是：" + cards);
    }

    public void start() {
        //6、洗牌
        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);

        //7、发牌:定义三个玩家：小红，小明，小张
        Map<String, List<Card>> players = new HashMap<>();
        List<Card> xh = new ArrayList<>();
        players.put("小红", xh);

        List<Card> xm = new ArrayList<>();
        players.put("小明", xm);

        List<Card> xz = new ArrayList<>();
        players.put("小张", xz);

        //只发出去51张
        for (int i = 0; i < cards.size() - 3; i++) {
            //获取当前遍历的牌
            Card card = cards.get(i);
            //判断这张牌发给谁
            if (i % 3 == 0) {
                xh.add(card);
            } else if (i % 3 == 1) {
                xm.add(card);
            } else if (i % 3 == 2) {
                xz.add(card);
            }
        }

        //8.拿最后三张底牌
        List<Card> lastCards = cards.subList(cards.size() - 3, cards.size());
        System.out.println("底牌是：" + lastCards);

        //9、叫地主
        call_(xh, xm, xz, lastCards);


        //10、对牌排序
        sortCards(xh);
        sortCards(xm);
        sortCards(xz);


        //11.看牌:遍历Map集合
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            //获取玩家名称
            String name = entry.getKey();
            //获取到玩家牌
            List<Card> playerCards = entry.getValue();
            //遍历玩家牌
            System.out.println(name + "的牌是" + playerCards);
        }
    }

    private void call_(List<Card> xh, List<Card> xm, List<Card> xz, List<Card> lastCards) {
        //随机把底牌放到某个玩家中
        int index = (int) (Math.random() * 3);
        switch (index) {
            case 0:
                xh.addAll(lastCards);
                break;
            case 1:
                xm.addAll(lastCards);
                break;
            case 2:
                xz.addAll(lastCards);
                break;
        }
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, (o1, o2) -> o2.getNum() - o1.getNum());
    }
}

