package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Lambda{
abstract public void demo();
}

/*
 * Lambda expressions can be used only for functional type interface
 * 
 * functional type interface is one which has only function
 */

class Data{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

}


public class App {

	public static void main(String[] args) {
		////////////////////////////////////////

		Lambda lambda1=new Lambda() {

			@Override
			public void demo() {
				System.out.println("Statement 1");
			}
		};
		/////////////////////////////////////

		Lambda lambda2=()->System.out.println("Statement 2");

		/////////////////////////////////////

		Lambda lambda3=(()->System.out.println("Statement 2"));

		////////////////////////////////////


		lambda1.demo();
		lambda2.demo();
		lambda3.demo();
		////////////////////////////////////
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("I am t1");
				// TODO Auto-generated method stub

			}
		});

		t1.start();
		//////////////////////////////////

		Thread t2=new Thread(
				()-> {System.out.println("I am t2 lambda");}
				);
		t2.start();

		//////////////////////////////////

		List<Data>list=new ArrayList<>();
		list.add(new Data("Kaustubha"));
		list.add(new Data("a"));
		list.add(new Data("b"));
		list.add(new Data("c"));

		Collections.sort(list,(Data o1, Data o2) ->
		{
			return	o2.getName().compareTo(o1.getName());
		}		
				);

		for(Data data:list) {
			System.out.println(data);
		}

	}}

