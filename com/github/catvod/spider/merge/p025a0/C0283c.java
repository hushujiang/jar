package com.github.catvod.spider.merge.p025a0;

import com.github.catvod.spider.merge.p022X.C0274a;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p024Z.C0280b;
import com.github.catvod.spider.merge.p027b0.C0319E;
import com.github.catvod.spider.merge.p029c0.C0441O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.a0.c */
/* loaded from: classes.dex */
public final class C0283c implements Iterable<C0281a>, Cloneable {

    /* renamed from: a */
    private int f520a = 0;

    /* renamed from: b */
    String[] f521b = new String[3];

    /* renamed from: c */
    Object[] f522c = new Object[3];

    /* renamed from: f */
    private void m1039f(String str, Object obj) {
        m1037h(this.f520a + 1);
        String[] strArr = this.f521b;
        int i = this.f520a;
        strArr[i] = str;
        this.f522c[i] = obj;
        this.f520a = i + 1;
    }

    /* renamed from: h */
    private void m1037h(int i) {
        C0277c.m1067h(i >= this.f520a);
        String[] strArr = this.f521b;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length >= 3 ? this.f520a * 2 : 3;
        if (i <= i2) {
            i = i2;
        }
        this.f521b = (String[]) Arrays.copyOf(strArr, i);
        this.f522c = Arrays.copyOf(this.f522c, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static String m1036i(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* renamed from: r */
    private int m1027r(String str) {
        C0277c.m1063l(str);
        for (int i = 0; i < this.f520a; i++) {
            if (str.equalsIgnoreCase(this.f521b[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static String m1026s(String str) {
        return '/' + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public boolean m1025t(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m1020y(int i) {
        C0277c.m1068g(i >= this.f520a);
        int i2 = (this.f520a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f521b;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.f522c;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.f520a - 1;
        this.f520a = i4;
        this.f521b[i4] = null;
        this.f522c[i4] = null;
    }

    /* renamed from: d */
    public final C0283c m1041d(String str, String str2) {
        m1039f(str, str2);
        return this;
    }

    /* renamed from: e */
    public final void m1040e(C0283c c0283c) {
        int i = c0283c.f520a;
        if (i == 0) {
            return;
        }
        m1037h(this.f520a + i);
        boolean z = this.f520a != 0;
        int i2 = 0;
        while (true) {
            if (i2 >= c0283c.f520a || !c0283c.m1025t(c0283c.f521b[i2])) {
                if (!(i2 < c0283c.f520a)) {
                    return;
                }
                C0281a c0281a = new C0281a(c0283c.f521b[i2], (String) c0283c.f522c[i2], c0283c);
                i2++;
                if (z) {
                    m1023v(c0281a);
                } else {
                    m1039f(c0281a.m1048a(), c0281a.getValue());
                }
            } else {
                i2++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0283c.class != obj.getClass()) {
            return false;
        }
        C0283c c0283c = (C0283c) obj;
        if (this.f520a != c0283c.f520a) {
            return false;
        }
        for (int i = 0; i < this.f520a; i++) {
            int m1028q = c0283c.m1028q(this.f521b[i]);
            if (m1028q == -1) {
                return false;
            }
            Object obj2 = this.f522c[i];
            Object obj3 = c0283c.f522c[m1028q];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final List<C0281a> m1038g() {
        ArrayList arrayList = new ArrayList(this.f520a);
        for (int i = 0; i < this.f520a; i++) {
            if (!m1025t(this.f521b[i])) {
                arrayList.add(new C0281a(this.f521b[i], (String) this.f522c[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f522c) + (((this.f520a * 31) + Arrays.hashCode(this.f521b)) * 31);
    }

    public final boolean isEmpty() {
        return this.f520a == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<C0281a> iterator() {
        return new C0282b(this);
    }

    /* renamed from: j */
    public final C0283c clone() {
        try {
            C0283c c0283c = (C0283c) super.clone();
            c0283c.f520a = this.f520a;
            c0283c.f521b = (String[]) Arrays.copyOf(this.f521b, this.f520a);
            c0283c.f522c = Arrays.copyOf(this.f522c, this.f520a);
            return c0283c;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public final int m1034k(C0319E c0319e) {
        int i = 0;
        if (this.f520a == 0) {
            return 0;
        }
        boolean m851e = c0319e.m851e();
        int i2 = 0;
        while (i < this.f521b.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f521b;
                if (i4 < strArr.length && strArr[i4] != null) {
                    if (!m851e || !strArr[i].equals(strArr[i4])) {
                        if (!m851e) {
                            String[] strArr2 = this.f521b;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    m1020y(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: l */
    public final String m1033l(String str) {
        int m1028q = m1028q(str);
        return m1028q == -1 ? "" : m1036i(this.f522c[m1028q]);
    }

    /* renamed from: m */
    public final String m1032m(String str) {
        int m1027r = m1027r(str);
        return m1027r == -1 ? "" : m1036i(this.f522c[m1027r]);
    }

    /* renamed from: n */
    public final boolean m1031n(String str) {
        return m1028q(str) != -1;
    }

    /* renamed from: o */
    public final boolean m1030o(String str) {
        return m1027r(str) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m1029p(Appendable appendable, C0287g c0287g) {
        String m1047b;
        int i = this.f520a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m1025t(this.f521b[i2]) && (m1047b = C0281a.m1047b(this.f521b[i2], c0287g.m1011h())) != null) {
                C0281a.m1045d(m1047b, (String) this.f522c[i2], appendable.append(' '), c0287g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final int m1028q(String str) {
        C0277c.m1063l(str);
        for (int i = 0; i < this.f520a; i++) {
            if (str.equals(this.f521b[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int size() {
        return this.f520a;
    }

    public final String toString() {
        StringBuilder m1058b = C0280b.m1058b();
        try {
            m1029p(m1058b, new C0288h("").m1009B0());
            return C0280b.m1052h(m1058b);
        } catch (IOException e) {
            throw new C0274a(e);
        }
    }

    /* renamed from: u */
    public final void m1024u() {
        for (int i = 0; i < this.f520a; i++) {
            String[] strArr = this.f521b;
            strArr[i] = C0441O.m624a(strArr[i]);
        }
    }

    /* renamed from: v */
    public final C0283c m1023v(C0281a c0281a) {
        m1022w(c0281a.m1048a(), c0281a.getValue());
        c0281a.f517c = this;
        return this;
    }

    /* renamed from: w */
    public final C0283c m1022w(String str, String str2) {
        C0277c.m1063l(str);
        int m1028q = m1028q(str);
        if (m1028q != -1) {
            this.f522c[m1028q] = str2;
        } else {
            m1039f(str, str2);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final void m1021x(String str, String str2) {
        int m1027r = m1027r(str);
        if (m1027r == -1) {
            m1039f(str, str2);
            return;
        }
        this.f522c[m1027r] = str2;
        if (this.f521b[m1027r].equals(str)) {
            return;
        }
        this.f521b[m1027r] = str;
    }
}
