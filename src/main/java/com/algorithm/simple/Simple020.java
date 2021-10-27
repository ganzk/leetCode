package com.algorithm.simple;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 * 输入: "()"
 * 输出: true
 *
 * 示例 2:
 * 输入: "()[]{}"
 * 输出: true
 *
 * 示例 3:
 * 输入: "(]"
 * 输出: false
 *
 * 示例 4:
 * 输入: "([)]"
 * 输出: false
 *
 * 示例 5:
 * 输入: "{[()]}[{}]()"
 * 输出: true
 *
 * @author Gan
 * @date 2020-12-18
 * @description 第二十题
 * @url https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Simple020 {

    public static void main(String[] args) {
        Simple020 simple020 = new Simple020();

        String str = "{[()]}[{}]()";
        String str1 = "([)]";

        boolean valid = simple020.isValid1(str);

        System.out.println(valid);

    }

    /**
     * 栈
     * 当是')' '}' ']'的时候就说明要出栈
     * 其他的就就压栈，最后栈为空，就是true
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        if(s.length() <= 1 ){
            return false;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < chars.length; i++) {

            if(chars[i] == ')' || chars[i] == '}' || chars[i] == ']'){
                if(stack.empty()){
                    return false;
                }
                char pop = stack.pop();
                if(!((pop  == '(' && chars[i] == ')') || (pop  == '{' && chars[i] == '}') || (pop  == '[' && chars[i] == ']') )){
                    return false;
                }
            }else {
                stack.push(chars[i]);
            }

        }
        if(stack.empty()){
            return true;
        }
        return false;
    }

    /**
     * 解法二
     * 也是栈，不过跟上一个方法的转换下思维
     */
    public boolean isValid1(String s) {

        if(s.length() <= 1 ){
            return false;
        }

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '(') stack.push(')');
            else if (chars[i] == '[') stack.push(']');
            else if (chars[i] == '{') stack.push('}');
            else if (stack.empty() || chars[i] != stack.pop()) return false;
        }

        return stack.empty();
    }



}
