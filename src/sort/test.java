package sort;

public class test {

	



	/**
	 * ���������㷨
	 * 
	 * @param data
	 *            Ŀ������
	 * @param start
	 *            ��ʼλ
	 * @param end
	 *            ����λ
	 */
	public static void quickSort(int[] data, int start, int end) {
		// ���ùؼ�����keyΪҪ��������ĵ�һ��Ԫ�أ�
		// ����һ�������key�ұߵ���ȫ����key��key��ߵ���ȫ����keyС
		int key = data[start];
		// ����������ߵ������������ƶ���key�����
		int i = start;
		// ���������ұߵ������������ƶ���keyС����
		int j = end;
		// �������������ұ�����С����������û������
		while (i < j) {
			while (data[j] > key && j > i) {
				j--;
			}
			data[i] = data[j];

			while (data[i] < key && i < j) {
				i++;
			}
			data[j] = data[i];
		}
		// ��ʱ i==j
		data[i] = key;

		// �ݹ����
		if (i - 1 > start) {
			// �ݹ���ã���keyǰ����������
			quickSort(data, start, i - 1);
		}
		if (i + 1 < end) {
			// �ݹ���ã���key������������
			quickSort(data, i + 1, end);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] p = {12, 9, 3, 7, 14};

		long start = System.currentTimeMillis();
		test.quickSort(p, 0, p.length - 1);// ��������

		System.out.println("����ʱ�䣺" + (System.currentTimeMillis() - start));
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
	}

}
