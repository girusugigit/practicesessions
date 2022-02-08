package org.test;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundException {
public static void main(String[] args) {
	List s = new ArrayList();
	s.add(10);
	s.add(20);
	System.out.println(s.get(0));
	System.out.println(s.get(3));
}
}
