package com.github.catvod.spider.merge.p007H;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0053f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.H.c */
/* loaded from: classes.dex */
public final class C0031c extends C0033e {
    /* renamed from: b */
    public static byte[] m1432b(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C0053f.m1406d(bArr, atm.m897d("4E0E121C3F7C09150A0C05361E15"));
        C0053f.m1406d(bArr2, atm.m897d("0E1F090125360B0E131A22"));
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m1431c(byte[] bArr, int i, int i2) {
        C0053f.m1406d(bArr, atm.m897d("4E0E121C3F7C09150A0C033E381B14122911070A16"));
        C0032d.m1428a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C0053f.m1407c(copyOfRange, atm.m897d("001B0C14622D1E13165B0D2A181B0306623B050A033A2A0A88FADC01243119565A133E37073314112920465A0E1A05360E1F025C"));
        return copyOfRange;
    }

    /* renamed from: d */
    public static Object[] m1430d(Object[] objArr, int i, int i2) {
        C0053f.m1406d(objArr, atm.m897d("4E0E121C3F7C09150A0C033E381B14122911070A16"));
        C0032d.m1428a(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C0053f.m1407c(copyOfRange, atm.m897d("001B0C14622D1E13165B0D2A181B0306623B050A033A2A0A88FADC01243119565A133E37073314112920465A0E1A05360E1F025C"));
        return copyOfRange;
    }

    /* renamed from: e */
    public static List m1429e(Object[] objArr) {
        C0053f.m1406d(objArr, atm.m897d("4E0E121C3F7C1E153700383908161F39252B1E"));
        return new ArrayList(new C0030b(objArr, false));
    }
}
