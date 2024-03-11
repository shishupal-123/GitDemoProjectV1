
package optional5;

import java.util.Optional;
import java.util.function.Function;

public class jtc {
 public static void main(String[] args) {
	String s1="som";
	Optional<Optional<String>> op1=Optional.of(Optional.ofNullable(s1));
    System.out.println(op1);
    System.out.println("------------------");
    System.out.println(op1.map(input->input));
    System.out.println(op1.flatMap(input->input));
    System.out.println("=============");
    Optional<Optional<String>> op2=op1.map(input1->input1.map(input2->input2.toUpperCase()));
    System.out.println("Add second line after creating BranchX");
 }
}
