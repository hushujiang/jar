package com.github.catvod.spider.merge.p058t;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.t.f */
/* loaded from: classes.dex */
public abstract class AbstractC0693f {

    /* renamed from: a */
    private static final AbstractC0693f f1310a;

    static {
        new C0690c(atm.m897d("081B09107A6C4253"), atm.m897d("2B383931091E2D32333F0714273435251D0A392E2F231B0033201B172F3C0F1C1D1D25320116171B23281B080901392E1D02030F7C6958494E407A6F5243515A"), '=');
        new C0690c(atm.m897d("081B09107A6C3F08165D65"), atm.m897d("2B383931091E2D32333F0714273435251D0A392E2F231B0033201B172F3C0F1C1D1D25320116171B23281B080901392E1D02030F7C6958494E407A6F5243572A"), '=');
        new C0692e(new C0688a(atm.m897d("081B09107F6A4253"), atm.m897d("2B383931091E2D32333F0714273435251D0A392E2F231B0033204846786D5C4D").toCharArray()), '=');
        new C0692e(new C0688a(atm.m897d("081B09107F6A221F025D65"), atm.m897d("5A4B4846786D5C4D424C0D1A293E3F330B10233031390116252A2B271F0C3F2C").toCharArray()), '=');
        f1310a = new C0689b();
    }

    /* renamed from: a */
    public static AbstractC0693f m92a() {
        return f1310a;
    }

    /* renamed from: b */
    public final byte[] m91b(CharSequence charSequence) {
        try {
            CharSequence mo89d = mo89d(charSequence);
            int length = (int) (((((C0692e) this).f1308b.f1302c * mo89d.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int mo90c = mo90c(bArr, mo89d);
            if (mo90c == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[mo90c];
            System.arraycopy(bArr, 0, bArr2, 0, mo90c);
            return bArr2;
        } catch (C0691d e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: c */
    abstract int mo90c(byte[] bArr, CharSequence charSequence);

    /* renamed from: d */
    abstract CharSequence mo89d(CharSequence charSequence);
}
