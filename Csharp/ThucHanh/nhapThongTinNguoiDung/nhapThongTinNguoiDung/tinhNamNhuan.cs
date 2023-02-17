using System;
namespace nhapThongTinNguoiDung
{
	public class tinhNamNhuan
	{
		public tinhNamNhuan()
		{
			int nam,N;
			nam = int.Parse(Console.ReadLine());
			if (nam % 100 == 0)
			{
				if (nam % 400 == 0)
				{
					Console.WriteLine("Nam {0} la nam nhuan", nam);
				}
                else
                {
                    Console.WriteLine("Nam {0} khong phai la nam nhuan", nam);
                }

            }
			else if (nam % 4 == 0)
			{
				Console.WriteLine("Nam {0} la nam nhuan", nam);
			}
            else
            {
                Console.WriteLine("Nam {0} khong phai la nam nhuan", nam);
            }

        }
	}
}

