package datasource;



public interface DataMapper<DomainObject> {
	void insert(DomainObject object);
	void update(DomainObject object);
	void delete(DomainObject object);
}
