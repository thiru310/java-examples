package com.example.interviewbit.solutions;

public class GasStationSolution {

	public static void main(String[] args) {
		int []gasStation={1,2,1,4};
        int []cost={2,1,3,1}; 
//        int []gasStation={3,1,1};
//        int []cost={1,2,2};
        System.out.println(findStartPoint(gasStation,cost));

	}

	private static int findStartPoint(int[] gas, int[] cost) {
		int total_cost = 0;
		int total_gas = 0;
		int tank = 0;
		int start = 0;
				
		for(int i=0; i < gas.length; i++) {
			System.out.println("iteration :::: "+i);
			total_gas += gas[i];
			total_cost += cost[i];
			tank += gas[i] - cost[i];
			System.out.println("total_gas ::: "+total_gas);
			System.out.println("total_cost ::: "+total_cost);
			System.out.println("tank ::: "+tank);
			
			if(tank < 0) {
				start = i+1;
				tank=0;
				System.out.println("Start ::: "+start);
			}
		}
		System.out.println("*******At the end *******");
		System.out.println("total_gas ::: "+total_gas);
		System.out.println("total_cost ::: "+total_cost);
		System.out.println("tank ::: "+tank);
		
		return total_gas >= total_cost ? start : -1;
	}

}
