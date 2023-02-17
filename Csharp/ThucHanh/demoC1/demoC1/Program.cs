
/*    int dem=0, sl,t;
    Console.Write("Nhap so luong so muon nhap: ");
    sl=int.Parse(Console.ReadLine());
    int[] a = new int[sl];
    for (int i=0; i < sl; i++)
    {
        Console.Write("nhap so thu " + (i+1) +" : ");
        a[i] = int.Parse(Console.ReadLine());
    }
    Console.WriteLine("Cac so lap lai 3 lan: ");
    for(int i=1; i < sl; i++)
    {
        if (a[i] == 0)
        {
            break;
        }
        for(t = i+1; t < sl; t++)
        {
                if (a[t] == a[i]){
                    a[t] = 0;
                    dem++;
                
                }
            
        }
        if (dem == 3)
        {
            Console.WriteLine(a[t]);
        }
        dem = 0;

    }
    Console.ReadKey();
Console.WriteLine(-1 + 4 * 6);
Double t= (35 + 5 % 7);
Console.WriteLine(t);
Console.WriteLine(14 + - 4 * 6 / 11);
Console.WriteLine(2 + 15 / 6 * 1 - 7 % 2);
Console.ReadKey();*/
/*Bài tập thứ 3: Nhập 3 chữ cái và hiển thị theo chiều ngược lại*/
string[] st = new string[3];
for (int i = 0; i < 3; i++)
{
    Console.Write("Nhap chu cai thu " + (i + 1) + " ");
    st[i] = Console.ReadLine();
}
Console.Write("Hien thi nguoc nhung chu cai da nhap");
for (int i = 2; i >= 0; i--)
{
    Console.Write(st[i] + ", ");
}
Console.ReadKey();




