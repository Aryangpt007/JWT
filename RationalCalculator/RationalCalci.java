class RationalCalci {
	
	Rational multiply(Rational n1, Rational n2)
	{
		return reduce(new Rational(n1.num*n2.num, n1.den*n2.den));
	}
	
	Rational divide(Rational n1, Rational n2)
	{
		return reduce(new Rational(n1.num*n2.den, n1.den*n2.num));
	}
	
	Rational add(Rational n1, Rational n2)
	{
		int num, den;
		num= n1.num*n2.den + n2.num*n1.den;
		den= n1.den*n2.den;
		return reduce(new Rational(num, den));
	}
	
	Rational subtract(Rational n1, Rational n2)
	{
		int num, den;
		num= n1.num*n2.den - n2.num*n1.den;
		den= n1.den*n2.den;
		return reduce(new Rational(num, den));
	}
	
	int compare(Rational n1, Rational n2)
	{
		double v1= convert(n1), v2= convert(n2);
		if(v1>v2)
			return 1;
		else if(v1<v2)
			return -1;
		else
			return 0;
	}
	
	double convert(Rational n)
	{
		return n.num*1.0/n.den;
	}
	
	int gcd(int n1, int n2)
	{
		int smaller= n1>n2?n1:n2, ans= -1;
		for(int i=1; i<=smaller; ++i)
		{
			if(n1%i==0 && n2%i==0)
				ans= i;
		}
		return ans;
	}
	
	Rational reduce(Rational n)
	{
		int factor= gcd(n.num, n.den);
		return new Rational(n.num/factor, n.den/factor);
	}
	
}