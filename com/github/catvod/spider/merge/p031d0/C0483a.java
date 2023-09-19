package com.github.catvod.spider.merge.p031d0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p001B.C0006a;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0085j;
import com.github.catvod.spider.merge.p013N.C0080e;
import com.github.catvod.spider.merge.p013N.C0081f;
import com.github.catvod.spider.merge.p013N.C0088m;
import com.github.catvod.spider.merge.p025a0.C0293m;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p029c0.C0459g;
import com.github.catvod.spider.merge.p033e0.C0490D;
import com.github.catvod.spider.merge.p033e0.C0492a;
import com.github.catvod.spider.merge.p035f0.C0525f;
import com.github.catvod.spider.merge.p035f0.C0526g;
import com.github.catvod.spider.merge.p043j0.C0580a;
import com.github.catvod.spider.merge.p043j0.C0585f;
import java.nio.CharBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.d0.a */
/* loaded from: classes.dex */
public final class C0483a {

    /* renamed from: a */
    private C0459g f912a;

    public C0483a(C0459g c0459g) {
        this.f912a = c0459g;
    }

    /* renamed from: a */
    public static C0483a m575a(String str) {
        return new C0483a(C0052e.m1414e(str).m986V());
    }

    /* renamed from: b */
    public final List<C0484b> m574b(String str) {
        C0484b c0484b;
        LinkedList linkedList = new LinkedList();
        try {
            C0080e m1373b = C0081f.m1373b(str.length());
            CharBuffer allocate = CharBuffer.allocate(str.length());
            allocate.put(str);
            allocate.flip();
            m1373b.m1379a(allocate);
            C0490D c0490d = new C0490D(new C0088m(new C0492a(AbstractC0085j.m1365k(m1373b.m1376d()))));
            c0490d.m1323t(new C0580a());
            C0525f c0525f = (C0525f) c0490d.m560F().mo476a(new C0526g(this.f912a));
            if (c0525f == null) {
                linkedList.add(new C0484b(""));
                return linkedList;
            } else if (c0525f.m438n()) {
                Iterator<C0293m> it = c0525f.m448d().iterator();
                while (it.hasNext()) {
                    linkedList.add(new C0484b(it.next()));
                }
                return linkedList;
            } else if (c0525f.m436p()) {
                for (String str2 : c0525f.m447e()) {
                    linkedList.add(new C0484b(str2));
                }
                return linkedList;
            } else if (c0525f.m434r()) {
                linkedList.add(new C0484b(c0525f.m445g()));
                return linkedList;
            } else if (!c0525f.m435q()) {
                if (c0525f.m440l()) {
                    linkedList.add(new C0484b(c0525f.m451a()));
                    return linkedList;
                } else if (c0525f.m439m()) {
                    linkedList.add(new C0484b(c0525f.m450b()));
                    return linkedList;
                } else {
                    linkedList.add(new C0484b(c0525f.m445g()));
                    return linkedList;
                }
            } else {
                Class m433s = c0525f.m433s();
                if (!m433s.isAssignableFrom(Long.class) && !m433s.isAssignableFrom(Integer.class)) {
                    c0484b = new C0484b(c0525f.m449c());
                    linkedList.add(c0484b);
                    return linkedList;
                }
                c0484b = new C0484b(c0525f.m446f());
                linkedList.add(c0484b);
                return linkedList;
            }
        } catch (Exception e) {
            StringBuilder m635a = C0424a.m635a(atm.m897d("3A161F143F3D4A1912102F334A0E12106C2B13140E143478051C5A0C232D185A02052D2C025A1F0D3C2A4A1508552F37071713016C394A"));
            m635a.append(C0006a.m1502b(e));
            throw new C0585f(m635a.toString(), e);
        }
    }
}
