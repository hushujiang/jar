package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p023Y.C0277c;
import com.github.catvod.spider.merge.p056r.C0673u;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.b0.a */
/* loaded from: classes.dex */
public final class C0362a {

    /* renamed from: a */
    private char[] f732a;

    /* renamed from: b */
    private Reader f733b;

    /* renamed from: c */
    private int f734c;

    /* renamed from: d */
    private int f735d;

    /* renamed from: e */
    private int f736e;

    /* renamed from: f */
    private int f737f;

    /* renamed from: g */
    private int f738g = -1;

    /* renamed from: h */
    private String[] f739h = new String[512];

    /* renamed from: i */
    private ArrayList<Integer> f740i = null;

    /* renamed from: j */
    private int f741j = 1;

    /* renamed from: k */
    private boolean f742k;

    /* renamed from: l */
    private String f743l;

    /* renamed from: m */
    private int f744m;

    public C0362a(Reader reader, int i) {
        C0277c.m1067h(reader.markSupported());
        this.f733b = reader;
        this.f732a = new char[Math.min(i, 32768)];
        m744b();
    }

    /* renamed from: N */
    private void m749N() {
        if (m721y()) {
            if (this.f740i.size() > 0) {
                int m720z = m720z(this.f737f);
                if (m720z == -1) {
                    m720z = 0;
                }
                int intValue = this.f740i.get(m720z).intValue();
                this.f741j += m720z;
                this.f740i.clear();
                this.f740i.add(Integer.valueOf(intValue));
            }
            for (int i = this.f736e; i < this.f734c; i++) {
                if (this.f732a[i] == '\n') {
                    this.f740i.add(Integer.valueOf(this.f737f + 1 + i));
                }
            }
        }
    }

    /* renamed from: b */
    private void m744b() {
        int i;
        int i2;
        boolean z;
        if (this.f742k || (i = this.f736e) < this.f735d) {
            return;
        }
        int i3 = this.f738g;
        if (i3 != -1) {
            i2 = i - i3;
            i = i3;
        } else {
            i2 = 0;
        }
        try {
            long j = i;
            long skip = this.f733b.skip(j);
            this.f733b.mark(32768);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 > 1024) {
                    break;
                }
                Reader reader = this.f733b;
                char[] cArr = this.f732a;
                int read = reader.read(cArr, i4, cArr.length - i4);
                if (read == -1) {
                    this.f742k = true;
                }
                if (read <= 0) {
                    break;
                }
                i4 += read;
            }
            this.f733b.reset();
            if (i4 > 0) {
                if (skip != j) {
                    z = false;
                }
                C0277c.m1067h(z);
                this.f734c = i4;
                this.f737f += i;
                this.f736e = i2;
                if (this.f738g != -1) {
                    this.f738g = 0;
                }
                this.f735d = Math.min(i4, 24576);
            }
            m749N();
            this.f743l = null;
        } catch (IOException e) {
            throw new C0673u(e);
        }
    }

    /* renamed from: c */
    private static String m743c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        boolean z = true;
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & 511;
        String str = strArr[i5];
        if (str != null) {
            if (i2 == str.length()) {
                int i6 = i;
                int i7 = i2;
                int i8 = 0;
                while (true) {
                    int i9 = i7 - 1;
                    if (i7 == 0) {
                        break;
                    }
                    int i10 = i6 + 1;
                    int i11 = i8 + 1;
                    if (cArr[i6] != str.charAt(i8)) {
                        break;
                    }
                    i6 = i10;
                    i7 = i9;
                    i8 = i11;
                }
            }
            z = false;
            if (z) {
                return str;
            }
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    /* renamed from: x */
    private boolean m722x() {
        return this.f736e >= this.f734c;
    }

    /* renamed from: z */
    private int m720z(int i) {
        if (m721y()) {
            int binarySearch = Collections.binarySearch(this.f740i, Integer.valueOf(i));
            return binarySearch < -1 ? Math.abs(binarySearch) - 2 : binarySearch;
        }
        return 0;
    }

    /* renamed from: A */
    final int m762A(int i) {
        if (m721y()) {
            int m720z = m720z(i);
            return m720z == -1 ? this.f741j : m720z + this.f741j + 1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final void m761B() {
        if (this.f734c - this.f736e < 1024) {
            this.f735d = 0;
        }
        m744b();
        this.f738g = this.f736e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m760C(java.lang.String r8) {
        /*
            r7 = this;
            r7.m744b()
            r7.m744b()
            int r0 = r8.length()
            int r1 = r7.f734c
            int r2 = r7.f736e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L14
            goto L24
        L14:
            r1 = 0
        L15:
            if (r1 >= r0) goto L29
            char r4 = r8.charAt(r1)
            char[] r5 = r7.f732a
            int r6 = r7.f736e
            int r6 = r6 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L26
        L24:
            r0 = 0
            goto L2a
        L26:
            int r1 = r1 + 1
            goto L15
        L29:
            r0 = 1
        L2a:
            if (r0 == 0) goto L36
            int r0 = r7.f736e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f736e = r8
            return r3
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0362a.m760C(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m759D(java.lang.String r8) {
        /*
            r7 = this;
            r7.m744b()
            int r0 = r8.length()
            int r1 = r7.f734c
            int r2 = r7.f736e
            int r1 = r1 - r2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L11
            goto L29
        L11:
            r1 = 0
        L12:
            if (r1 >= r0) goto L2e
            char r4 = r8.charAt(r1)
            char r4 = java.lang.Character.toUpperCase(r4)
            char[] r5 = r7.f732a
            int r6 = r7.f736e
            int r6 = r6 + r1
            char r5 = r5[r6]
            char r5 = java.lang.Character.toUpperCase(r5)
            if (r4 == r5) goto L2b
        L29:
            r0 = 0
            goto L2f
        L2b:
            int r1 = r1 + 1
            goto L12
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r7.f736e
            int r8 = r8.length()
            int r8 = r8 + r0
            r7.f736e = r8
            return r3
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p027b0.C0362a.m759D(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean m758E(char c) {
        return !m723w() && this.f732a[this.f736e] == c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m757F(char... cArr) {
        if (m723w()) {
            return false;
        }
        m744b();
        char c = this.f732a[this.f736e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m756G(char[] cArr) {
        m744b();
        return !m723w() && Arrays.binarySearch(cArr, this.f732a[this.f736e]) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public final boolean m755H() {
        if (m723w()) {
            return false;
        }
        char c = this.f732a[this.f736e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean m754I() {
        char c;
        return !m723w() && (c = this.f732a[this.f736e]) >= '0' && c <= '9';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean m753J() {
        if (m723w()) {
            return false;
        }
        char c = this.f732a[this.f736e];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || Character.isLetter(c);
    }

    /* renamed from: K */
    final int m752K(CharSequence charSequence) {
        m744b();
        char charAt = charSequence.charAt(0);
        int i = this.f736e;
        while (i < this.f734c) {
            if (charAt != this.f732a[i]) {
                do {
                    i++;
                    if (i >= this.f734c) {
                        break;
                    }
                } while (charAt != this.f732a[i]);
            }
            int i2 = i + 1;
            int length = (charSequence.length() + i2) - 1;
            int i3 = this.f734c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && charSequence.charAt(i5) == this.f732a[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.f736e;
                }
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: L */
    public final int m751L() {
        return this.f737f + this.f736e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final void m750M() {
        int i = this.f738g;
        if (i != -1) {
            this.f736e = i;
            this.f738g = -1;
            return;
        }
        throw new C0673u(new IOException(atm.m897d("271B081E6C31040C1B19253C")));
    }

    /* renamed from: O */
    public final void m748O(boolean z) {
        if (z && this.f740i == null) {
            this.f740i = new ArrayList<>(409);
            m749N();
        } else if (z) {
        } else {
            this.f740i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m747P() {
        int i = this.f736e;
        if (i < 1) {
            throw new C0673u(new IOException(atm.m897d("3D2E3C4F6C16055A18002A3E0F085A19293E1E5A0E1A6C2D0419151B3F2D071F54")));
        }
        this.f736e = i - 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void m746Q() {
        this.f738g = -1;
    }

    /* renamed from: a */
    public final void m745a() {
        this.f736e++;
    }

    /* renamed from: d */
    public final void m742d() {
        Reader reader = this.f733b;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f733b = null;
            this.f732a = null;
            this.f739h = null;
            throw th;
        }
        this.f733b = null;
        this.f732a = null;
        this.f739h = null;
    }

    /* renamed from: e */
    final int m741e(int i) {
        int m720z;
        if (m721y() && (m720z = m720z(i)) != -1) {
            return (i - this.f740i.get(m720z).intValue()) + 1;
        }
        return i + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final char m740f() {
        m744b();
        char c = m722x() ? (char) 65535 : this.f732a[this.f736e];
        this.f736e++;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final String m739g(boolean z) {
        int i = this.f736e;
        int i2 = this.f734c;
        char[] cArr = this.f732a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                } else if (c != '\'') {
                    continue;
                    i3++;
                } else if (z) {
                    break;
                }
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f736e = i3;
        return i3 > i ? m743c(this.f732a, this.f739h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final String m738h() {
        int i = this.f736e;
        int i2 = this.f734c;
        char[] cArr = this.f732a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f736e = i3;
        return i3 > i ? m743c(this.f732a, this.f739h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final String m737i() {
        int i;
        char c;
        m744b();
        int i2 = this.f736e;
        while (true) {
            i = this.f736e;
            if (i >= this.f734c || (c = this.f732a[i]) < '0' || c > '9') {
                break;
            }
            this.f736e = i + 1;
        }
        return m743c(this.f732a, this.f739h, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final String m736j() {
        int i;
        char c;
        m744b();
        int i2 = this.f736e;
        while (true) {
            i = this.f736e;
            if (i >= this.f734c || (((c = this.f732a[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.f736e = i + 1;
        }
        return m743c(this.f732a, this.f739h, i2, i - i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final String m735k() {
        char c;
        m744b();
        int i = this.f736e;
        while (true) {
            int i2 = this.f736e;
            if (i2 >= this.f734c || (((c = this.f732a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f736e++;
        }
        return m743c(this.f732a, this.f739h, i, this.f736e - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final String m734l() {
        char c;
        m744b();
        int i = this.f736e;
        while (true) {
            int i2 = this.f736e;
            if (i2 >= this.f734c || (((c = this.f732a[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.f736e++;
        }
        while (!m722x()) {
            char[] cArr = this.f732a;
            int i3 = this.f736e;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f736e = i3 + 1;
        }
        return m743c(this.f732a, this.f739h, i, this.f736e - i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final String m733m() {
        int i = this.f736e;
        int i2 = this.f734c;
        char[] cArr = this.f732a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f736e = i3;
        return i3 > i ? m743c(this.f732a, this.f739h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final String m732n() {
        m744b();
        int i = this.f736e;
        int i2 = this.f734c;
        char[] cArr = this.f732a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f736e = i3;
        return i3 > i ? m743c(this.f732a, this.f739h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final String m731o() {
        int m752K = m752K(atm.m897d("372744"));
        if (m752K != -1) {
            String m743c = m743c(this.f732a, this.f739h, this.f736e, m752K);
            this.f736e += m752K;
            return m743c;
        }
        int i = this.f734c;
        int i2 = this.f736e;
        if (i - i2 < 3) {
            return m727s();
        }
        int i3 = (i - 3) + 1;
        String m743c2 = m743c(this.f732a, this.f739h, i2, i3 - i2);
        this.f736e = i3;
        return m743c2;
    }

    /* renamed from: p */
    public final String m730p(char c) {
        int i;
        m744b();
        int i2 = this.f736e;
        while (true) {
            if (i2 >= this.f734c) {
                i = -1;
                break;
            } else if (c == this.f732a[i2]) {
                i = i2 - this.f736e;
                break;
            } else {
                i2++;
            }
        }
        if (i != -1) {
            String m743c = m743c(this.f732a, this.f739h, this.f736e, i);
            this.f736e += i;
            return m743c;
        }
        return m727s();
    }

    /* renamed from: q */
    public final String m729q(char... cArr) {
        m744b();
        int i = this.f736e;
        int i2 = this.f734c;
        char[] cArr2 = this.f732a;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f736e = i3;
        return i3 > i ? m743c(this.f732a, this.f739h, i, i3 - i) : "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final String m728r(char... cArr) {
        m744b();
        int i = this.f736e;
        int i2 = this.f734c;
        char[] cArr2 = this.f732a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f736e = i3;
        return i3 > i ? m743c(this.f732a, this.f739h, i, i3 - i) : "";
    }

    /* renamed from: s */
    final String m727s() {
        m744b();
        char[] cArr = this.f732a;
        String[] strArr = this.f739h;
        int i = this.f736e;
        String m743c = m743c(cArr, strArr, i, this.f734c - i);
        this.f736e = this.f734c;
        return m743c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m726t(String str) {
        if (str.equals(this.f743l)) {
            int i = this.f744m;
            if (i == -1) {
                return false;
            }
            if (i >= this.f736e) {
                return true;
            }
        }
        this.f743l = str;
        Locale locale = Locale.ENGLISH;
        int m752K = m752K(str.toLowerCase(locale));
        if (m752K > -1) {
            this.f744m = this.f736e + m752K;
            return true;
        }
        int m752K2 = m752K(str.toUpperCase(locale));
        boolean z = m752K2 > -1;
        this.f744m = z ? this.f736e + m752K2 : -1;
        return z;
    }

    public final String toString() {
        int i = this.f734c;
        int i2 = this.f736e;
        return i - i2 < 0 ? "" : new String(this.f732a, i2, i - i2);
    }

    /* renamed from: u */
    public final char m725u() {
        m744b();
        if (m722x()) {
            return (char) 65535;
        }
        return this.f732a[this.f736e];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final String m724v() {
        return m762A(this.f737f + this.f736e) + atm.m897d("50") + m741e(this.f737f + this.f736e);
    }

    /* renamed from: w */
    public final boolean m723w() {
        m744b();
        return this.f736e >= this.f734c;
    }

    /* renamed from: y */
    public final boolean m721y() {
        return this.f740i != null;
    }
}
