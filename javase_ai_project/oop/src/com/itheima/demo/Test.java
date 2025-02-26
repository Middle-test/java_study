package com.itheima.demo;

public class Test {
    public static void main(String[] args) {
        //目标：完成面向对象的综合小案例
        //1、设计电影类
        //2、封装系统中的全部电影数据
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "《战狼》", 59.9, "吴京");
        movies[1] = new Movie(2, "《长津湖》", 39.9, "吴京");
        movies[2] = new Movie(3, "《哪吒之魔童降世》", 68, "饺子");
        movies[3] = new Movie(4, "《哪吒之魔童闹海》", 70, "饺子");
        movies[4] = new Movie(5, "《封神》", 49.9, "于适");
        movies[5] = new Movie(6, "《唐探1900》", 58.8, "刘昊然");
        //3、创建电影操作对象，专门负责电影数据的业务操作
        MovieOperator mo = new MovieOperator(movies);
        System.out.println("------------电影信息如下------------");
        mo.printAllMovie();//Alt+Enter
        //根据id查询电影
        mo.searchMovieById();
    }
}
