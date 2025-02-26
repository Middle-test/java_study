package com.itheima.demo;

import java.util.Scanner;

//电影操作类
public class MovieOperator {
    private Movie[] movies;//记住一个电影对象的数组
    private int count;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovie() {
        for (int i = 0; i < this.movies.length; i++) {
            Movie m = this.movies[i];
            System.out.println(m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor());
        }
    }

    //根据id查询电影
    public void searchMovieById() {
        System.out.print("请输入要查询的电影id:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < this.movies.length; i++) {
            if (this.movies[i].getId() == id) {
                System.out.println(this.movies[i].getId() + "\t" + this.movies[i].getName() + "\t" + this.movies[i].getPrice() + "\t" + this.movies[i].getActor());
            }
        }
        System.out.println("没有找到该电影");
    }
}
