package com.github.catvod.spider.merge.p001B;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p002C.C0007a;
import com.github.catvod.spider.merge.p003D.C0013b;
import com.github.catvod.spider.merge.p003D.C0014c;
import com.github.catvod.spider.merge.p018S.C0201b;
import com.github.catvod.spider.merge.p018S.C0207h;
import com.github.catvod.spider.merge.p063y.EnumC0747a;
import com.github.catvod.spider.merge.p063y.EnumC0748b;
import com.github.catvod.spider.merge.p063y.InterfaceC0749c;
import com.github.catvod.spider.merge.p064z.C0752b;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.B.a */
/* loaded from: classes.dex */
public final class C0006a implements InterfaceC0749c {
    /* renamed from: b */
    public static String m1502b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        for (Throwable th2 = th; th2 != null && !arrayList.contains(th2); th2 = th2.getCause()) {
            arrayList.add(th2);
        }
        Throwable th3 = arrayList.isEmpty() ? null : (Throwable) arrayList.get(arrayList.size() - 1);
        if (th3 != null) {
            th = th3;
        }
        int i = C0201b.f355e;
        String m1178a = C0201b.m1178a(th.getClass());
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(m1178a);
        sb.append(atm.m897d("505A"));
        int i2 = C0207h.f362a;
        if (message == null) {
            message = "";
        }
        sb.append(message);
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.p063y.InterfaceC0749c
    /* renamed from: a */
    public C0752b mo14a(String str, EnumC0747a enumC0747a, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException(atm.m897d("2C150F1B28780F170A0135780915140129361E09"));
        }
        if (i >= 0 && i2 >= 0) {
            EnumC0748b enumC0748b = EnumC0748b.f1394a;
            int m1499c = map.containsKey(enumC0748b) ? C0007a.m1499c(map.get(enumC0748b).toString()) : 1;
            EnumC0748b enumC0748b2 = EnumC0748b.f1399f;
            int parseInt = map.containsKey(enumC0748b2) ? Integer.parseInt(map.get(enumC0748b2).toString()) : 4;
            C0013b m1458a = C0014c.m1473c(str, m1499c, map).m1458a();
            if (m1458a != null) {
                int m1478e = m1458a.m1478e();
                int m1479d = m1458a.m1479d();
                int i3 = parseInt << 1;
                int i4 = m1478e + i3;
                int i5 = i3 + m1479d;
                int max = Math.max(i, i4);
                int max2 = Math.max(i2, i5);
                int min = Math.min(max / i4, max2 / i5);
                int i6 = (max - (m1478e * min)) / 2;
                int i7 = (max2 - (m1479d * min)) / 2;
                C0752b c0752b = new C0752b(max, max2);
                int i8 = 0;
                while (i8 < m1479d) {
                    int i9 = i6;
                    int i10 = 0;
                    while (i10 < m1478e) {
                        if (m1458a.m1481b(i10, i8) == 1) {
                            c0752b.m2d(i9, i7, min, min);
                        }
                        i10++;
                        i9 += min;
                    }
                    i8++;
                    i7 += min;
                }
                return c0752b;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException(atm.m897d("381F0B00292B1E1F1E552831071F1406253704095A143E3D4A0E151A6C2B071B16197678") + i + 'x' + i2);
    }
}
