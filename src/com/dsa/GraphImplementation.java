package com.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GraphImplementation {

    public static class Graph {
        int numberOfNodes;
        HashMap<Integer, ArrayList<Integer>> adjacentList;

        Graph() {
            this.numberOfNodes = 0;
            this.adjacentList = new HashMap<Integer, ArrayList<Integer>>();
        }

        public void addVertex(int node) {
            this.adjacentList.put(node, new ArrayList<>());
            this.numberOfNodes++;
        }

        public void addEdge(int node1, int node2) {
            if(!this.adjacentList.containsKey(node1) && !this.adjacentList.containsKey(node2)) {
                this.adjacentList.put(node1, new ArrayList<>(node2));
                this.adjacentList.put(node2, new ArrayList<>(node1));
                this.numberOfNodes += 2;
            } else if(this.adjacentList.containsKey(node1) && !this.adjacentList.containsKey(node2)) {
                ArrayList<Integer> newList = this.adjacentList.get(node1);
                newList.add(node2);
                this.adjacentList.put(node1, newList);
                this.adjacentList.put(node2, new ArrayList<>(node1));
                this.numberOfNodes++;
            } else if(this.adjacentList.containsKey(node2) && !this.adjacentList.containsKey(node1)) {
                ArrayList<Integer> newList = this.adjacentList.get(node2);
                newList.add(node1);
                this.adjacentList.put(node2, newList);
                this.adjacentList.put(node1, new ArrayList<>(node2));
                this.numberOfNodes++;
            } else {
                ArrayList<Integer> node1List = this.adjacentList.get(node1);
                node1List.add(node2);
                ArrayList<Integer> node2List = this.adjacentList.get(node2);
                node2List.add(node1);
                this.adjacentList.put(node1, node1List);
                this.adjacentList.put(node2, node2List);
            }
        }

        public void printGraph() {
            this.adjacentList.forEach((x, y) -> System.out.println(x + " -> " + y));
        }
    }

    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);
        myGraph.addVertex(5);
        myGraph.addVertex(6);
        myGraph.addEdge(3, 4);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(4, 2);
        myGraph.addEdge(4, 5);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 0);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(6, 5);

        myGraph.printGraph();
    }

}
