import com.programcreek.designpatterns.*;
import com.programcreek.designpatterns.state.StateContext;
import com.programcreek.designpatterns.strategy.EasyPolice;
import com.programcreek.designpatterns.strategy.HardPolice;
import com.programcreek.designpatterns.strategy.Situation;
import com.programcreek.designpatterns.visitor.City;
import com.programcreek.designpatterns.visitor.FirstTimeVisitor;
import com.programcreek.designpatterns.visitor.Visitor;

//test entry point 
public class Main {
	public static void main(String args[]){
		StateContext sc = new StateContext();
		sc.saySomething();
		sc.saySomething();
		sc.saySomething();
		sc.saySomething();
	}
}
