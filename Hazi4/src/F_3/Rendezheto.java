package F_3;

public interface Rendezheto<T> {
public abstract boolean egyenlo(Object O);
boolean nagyobbMint(Object O);
boolean kissebbMint(Object O);

   int compareTo(T o);
}