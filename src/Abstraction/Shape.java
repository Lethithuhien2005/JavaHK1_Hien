package Abstraction;

public abstract class Shape {
protected ToaDo td;

public Shape(ToaDo td) {
	this.td = td;
}

public ToaDo getTd() {
	return td;
}

public void setTd(ToaDo td) {
	this.td = td;
}
public abstract double tinhDientich();
}
