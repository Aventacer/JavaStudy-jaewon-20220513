package j22_람다식;

// 람다를 위한 인터페이스는 아래 functionalInterface를 써줘야하고 메소드는 단 한개만 가능
@FunctionalInterface
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);
}
