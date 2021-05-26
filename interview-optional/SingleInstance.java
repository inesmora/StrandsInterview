package com.strands.spf;

/**
 * <p>
 * Single instance in a multi threading environment
 * </p>
 * 
 * @author strands
 * 
 */
public class SingleInstance {

  private static SingleInstance instance;


  public SingleInstance() {
    // TODO Auto-generated constructor stub
  }

  public synchronized static SingleInstance getInstance() {
    if(instance == null) {
      instance = new SingleInstance();
    }
    else return instance;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
