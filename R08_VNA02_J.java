/* Non Compliant */

inal class Flag {
  private volatile boolean flag = true;
 
  public void toggle() {  // Unsafe
    flag ^= true;
  }
 
  public boolean getFlag() { // Safe
    return flag;
  }
}

/* Compliant */

final class Flag {
  private boolean flag = true;
 
  public synchronized void toggle() {
    flag ^= true; // Same as flag = !flag;
  }
 
  public synchronized boolean getFlag() {
    return flag;
  }
}