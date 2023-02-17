using System;
namespace nhapThongTinNguoiDung
{
	public class nhapND
	{
		public nhapND()
		{
           
                string tenNguoiDung = "TranNgocTien", matKhau = "tien123@", nd, mk;
                Console.Write("Nhap ten dang nhap");
                nd = Console.ReadLine();
                Console.Write("Nhap mat khua");
                mk = Console.ReadLine();
                if (string.Compare(nd, tenNguoiDung, false) == 0 && String.Compare(mk, matKhau, false) == 0)
                {
                    Console.Write("ten dang nhap va mat khua dung");
                }
                else
                {
                    Console.Write("ten dang nhap hoac mat khau sai");
                }
            
            
        }
	}
}

