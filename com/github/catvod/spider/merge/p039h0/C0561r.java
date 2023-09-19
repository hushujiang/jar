package com.github.catvod.spider.merge.p039h0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p035f0.C0521b;
import com.github.catvod.spider.merge.p035f0.C0524e;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.InterfaceC0522c;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

/* renamed from: com.github.catvod.spider.merge.h0.r */
/* loaded from: classes.dex */
public final class C0561r implements InterfaceC0522c {
    /* renamed from: b */
    private Double m321b(String str) {
        if (C0521b.f943a.matcher(str).matches()) {
            return Double.valueOf(Double.parseDouble(str));
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    /* renamed from: a */
    public final C0525f mo322a(C0524e c0524e, List<C0525f> list) {
        if (list.isEmpty()) {
            return new C0525f(0);
        }
        LinkedList linkedList = new LinkedList();
        for (C0525f c0525f : list) {
            if (c0525f.m435q()) {
                linkedList.add(c0525f.m449c());
            }
            if (c0525f.m434r()) {
                Double m321b = m321b(c0525f.m445g());
                if (m321b == null) {
                    return null;
                }
                linkedList.add(m321b);
            }
            if (c0525f.m438n()) {
                Iterator<C0293m> it = c0525f.m448d().iterator();
                while (it.hasNext()) {
                    Double m321b2 = m321b(it.next().m972k0());
                    if (m321b2 == null) {
                        return null;
                    }
                    linkedList.add(m321b2);
                }
                continue;
            }
        }
        Double d = (Double) linkedList.stream().reduce(Double.valueOf(0.0d), new BinaryOperator() { // from class: com.github.catvod.spider.merge.h0.q
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
            }
        });
        return d.compareTo(Double.valueOf(new BigDecimal(d.longValue()).doubleValue())) == 0 ? new C0525f(new Long(d.longValue())) : new C0525f(d);
    }

    @Override // com.github.catvod.spider.merge.p035f0.InterfaceC0522c
    public final String name() {
        return atm.m897d("190F17");
    }
}
