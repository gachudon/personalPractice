package pack_0228;

import java.util.Random;
import java.util.Scanner;

public class MyStackTester {
	
	public static boolean isBracketMatched(String expression) {
		MyStack<Character> stack = new MyStack<>();
		for(char ch: expression.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if(ch==')'||ch=='}'||ch==']') {
				if(stack.isEmpty())
					return false;
			
			char top = stack.pop();
			if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static int calculateInfixExpression(String expression) {
		MyStack<Character> operators = new MyStack<>();
		MyStack<Integer> operands = new MyStack<>();
		for(char ch:expression.toCharArray()) {
			if(Character.isDigit(ch)) {
				operands.push(Character.getNumericValue(ch));
			} else if (ch =='+' ||ch =='-' ||ch =='*' ||ch =='/') {
				while(!operators.isEmpty() && getPriority(operators.peek())>=getPriority(ch)) {
					char operator = operators.pop();
					int operand2 = operands.pop();
					int operand1 = operands.pop();
					operands.push(performOperation(operand1,operand2,operator));
				}
				operators.push(ch);
			}else if (ch =='(') {
				operators.push(ch);
			}else if(ch ==')') {
				while(operators.peek()!='(') {
					char operator = operators.pop();
					int operand2 = operands.pop();
					int operand1 = operands.pop();
					operands.push(performOperation(operand1,operand2,operator));
				}
				operators.pop();
			}
		}
		while(!operators.isEmpty()) {
			char operator = operators.pop();
			int operand2 = operands.pop();
			int operand1 = operands.pop();
			operands.push(performOperation(operand1,operand2,operator));
		}
		return operands.pop();
	}
	
	private static int getPriority(char operator) {
		switch(operator) {
		case '+': case'-': return 1;
		case '*': case'/': return 2;
		default: return 0;
		}
	}
	
	private static int performOperation(int operand1,int operand2,char operator) {
//		System.out.println(operand1 + operator + operand2);
		switch(operator) {
		case '+':
			return operand1 + operand2;
		case '-':
			return operand1 - operand2;
		case '*':
			return operand1 * operand2;
		case '/':
			return operand1 / operand2;
		default:
			throw new IllegalArgumentException("잘못된 연산자: "+operator);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String infixExpression = "3 + 5 * (2 - 8) / 4";
		int result = calculateInfixExpression(infixExpression);
		System.out.println("중위 표기법에 연산 결과: "+result);
		
//		Scanner scan = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.print("스택의 크기를 입력하세요 >> ");
//		int capa = Integer.parseInt(scan.nextLine());
//		MyStack mystk = new MyStack(capa);
//		do {
//			mystk.push(rand.nextInt(100)+1);
//		}while(!mystk.isFull());
//		
//		mystk.dump();
//		for(int i=0;i<capa;i++)
//			System.out.printf("%d번째 팝한 값 : %d\n",i+1,mystk.pop());
//		scan.close();
		
//		String expression1 = "{[()]()}";
//		String expression2 = "{[(])}";
//		System.out.println("식1은 "+(isBracketMatched(expression1)?"짝이 맞음":"짝이 맞지 않음"));
//		System.out.println("식2는 "+(isBracketMatched(expression2)?"짝이 맞음":"짝이 맞지 않음"));
	}

}
