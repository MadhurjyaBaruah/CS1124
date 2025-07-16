class Customer
{
    private int custId;
    private String name;
    private String address;
    private String phoneNo;

    public Customer(int custId, String name, String address, String phoneNo)
    {
        this.custId = custId;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void setCustId(int custId)
    {
        this.custId = custId;
    }

    public int getCustId()
    {
        return this.custId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void setPhoneNo(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo()
    {
        return this.phoneNo;
    }

    public String toString()
    {
        return "ID: " + custId + ", Name: " + name + ", Address: " + address + ", Phone: " + phoneNo;
    }
}

class CustomerDemo
{
    public static void main(String[] args)
    {
        Customer[] customers = new Customer[5];

        customers[0] = new Customer(01, "Raj", "Guwahati", "9999999999");
        customers[1] = new Customer(02, "Aftab", "Jorhat", "9999999998");
        customers[2] = new Customer(03, "Injamam", "Dibrugarh", "9999999997");
        customers[3] = new Customer(04, "Sumit", "Sivasagar", "9999999996");
        customers[4] = new Customer(05, "Rahul", "Tinsukia", "9999999995");

        for(int i = 0; i < 5; i++)
        {
            System.out.println(customers[i]);
        }
    }
}
