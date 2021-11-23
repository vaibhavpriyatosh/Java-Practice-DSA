class trie_insert_delete{

static void insert(TrieNode root, String key) 
{
    int level;
    int length = key.length();
    int index;

    TrieNode pCrawl = root;

    //if not present, we insert key into trie. If the key is prefix 
    //of trie node, we just mark the leaf node.
    for (level = 0; level < length; level++)
    {
        index = key.charAt(level) - 'a';
        if (pCrawl.children[index] == null)
            pCrawl.children[index] = new TrieNode();

        pCrawl = pCrawl.children[index];
    }

    //marking last node as leaf.
    pCrawl.isEndOfWord = true;
}

//Function to use TRIE data structure and search the given string.
static boolean search(TrieNode root, String key)
{
    int level;
    int length = key.length();
    int index;
    TrieNode pCrawl = root;

    for (level = 0; level < length; level++) {
        index = key.charAt(level) - 'a';

        if (pCrawl.children[index] == null) return false;

        pCrawl = pCrawl.children[index];
    }
    //returning true if key is present else false.
    return (pCrawl != null && pCrawl.isEndOfWord);
}
}